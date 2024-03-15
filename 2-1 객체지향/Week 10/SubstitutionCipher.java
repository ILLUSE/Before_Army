
public class SubstitutionCipher implements MessageEncoder,MessageDecoder{

	int shift; //�󸶳� �ű����
	
	
	public SubstitutionCipher(int shift) { //������
		this.shift = shift;
	}
	
	@Override
	public String decode(String cipherText) { //decode �޼ҵ�
		String decodedText = "";
		for(int i=0;i<cipherText.length();i++) { //�� �ܾ encode�ϱ�
			char ch = cipherText.charAt(i);
			decodedText = decodedText + shift(ch,-shift);
		}
		return decodedText;
	}

	@Override
	public String encode(String plainText) { //encode �޼ҵ�
		String encodedText = "";
		for(int i=0;i<plainText.length();i++) {
			char ch = plainText.charAt(i);
			encodedText = encodedText + shift(ch,shift);
		}
		return encodedText;
	}
	
	 
	 // �ܾ shift��ŭ �����ϴ� �޼ҵ�
	private char shift(char ch, int shift){
	char shiftedChar = ch;
	// �ҹ��� ���̽�
	if(ch >= 'a' && ch <= 'z')
		shiftedChar = (char) ( 'a' + ( ch - 'a' + shift ) %26 );
	// �빮�� ���̽�
	else if(ch >= 'A' && ch <= 'Z')
		shiftedChar = (char) ( 'A' + ( ch - 'A' + shift ) %26 );
	
	return shiftedChar;
	} 
	

	
	
}
