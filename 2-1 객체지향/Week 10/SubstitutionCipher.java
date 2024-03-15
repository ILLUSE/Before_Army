
public class SubstitutionCipher implements MessageEncoder,MessageDecoder{

	int shift; //얼마나 옮길건지
	
	
	public SubstitutionCipher(int shift) { //생성자
		this.shift = shift;
	}
	
	@Override
	public String decode(String cipherText) { //decode 메소드
		String decodedText = "";
		for(int i=0;i<cipherText.length();i++) { //한 단어씩 encode하기
			char ch = cipherText.charAt(i);
			decodedText = decodedText + shift(ch,-shift);
		}
		return decodedText;
	}

	@Override
	public String encode(String plainText) { //encode 메소드
		String encodedText = "";
		for(int i=0;i<plainText.length();i++) {
			char ch = plainText.charAt(i);
			encodedText = encodedText + shift(ch,shift);
		}
		return encodedText;
	}
	
	 
	 // 단어를 shift만큼 조정하는 메소드
	private char shift(char ch, int shift){
	char shiftedChar = ch;
	// 소문자 케이스
	if(ch >= 'a' && ch <= 'z')
		shiftedChar = (char) ( 'a' + ( ch - 'a' + shift ) %26 );
	// 대문자 케이스
	else if(ch >= 'A' && ch <= 'Z')
		shiftedChar = (char) ( 'A' + ( ch - 'A' + shift ) %26 );
	
	return shiftedChar;
	} 
	

	
	
}
