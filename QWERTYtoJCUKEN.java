package keyboard;

public class QWERTYtoJCUKEN
{
	public static char QWERTYtoJCUKEN(char letter)
	{
		switch (letter)
		{
			//Lowercase input
			case '`': return 'ё';

			case 'q': return 'й';
			case 'w': return 'ц';
			case 'e': return 'у';
			case 'r': return 'к';
			case 't': return 'е';
			case 'y': return 'н';
			case 'u': return 'г';
			case 'i': return 'ш';
			case 'o': return 'щ';
			case 'p': return 'з';
			case '[': return 'х';
			case ']': return 'ъ';
			
			case 'a': return 'ф';
			case 's': return 'ы';
			case 'd': return 'в';
			case 'f': return 'а';
			case 'g': return 'п';
			case 'h': return 'р';
			case 'j': return 'о';
			case 'k': return 'л';
			case 'l': return 'д';
			case ';': return 'ж';
			case '\'': return 'э';
			
			case 'z': return 'я';
			case 'x': return 'ч';
			case 'c': return 'с';
			case 'v': return 'м';
			case 'b': return 'и';
			case 'n': return 'т';
			case 'm': return 'ь';
			case ',': return 'б';
			case '.': return 'ю';
			case '/': return '.';
			
			// Upper case letters
			case '~': return 'Ё';
			case '@': return '"';
			case '#': return '№';
			case '$': return ';';
			case '^': return ':';
			case '&': return '?';
			
			case 'Q': return 'Й';
			case 'W': return 'Ц';
			case 'E': return 'У';
			case 'R': return 'К';
			case 'T': return 'Е';
			case 'Y': return 'Н';
			case 'U': return 'Г';
			case 'I': return 'Ш';
			case 'O': return 'Щ';
			case 'P': return 'З';
			case '{': return 'Х';
			case '}': return 'Ъ';
			case '|': return '/';
			
			case 'A': return 'Ф';
			case 'S': return 'Ы';
			case 'D': return 'В';
			case 'F': return 'А';
			case 'G': return 'П';
			case 'H': return 'Р';
			case 'J': return 'О';
			case 'K': return 'Л';
			case 'L': return 'Д';
			case ':': return 'Ж';
			case '\"': return 'Э';
			
			case 'Z': return 'Я';
			case 'X': return 'Ч';
			case 'C': return 'С';
			case 'V': return 'М';
			case 'B': return 'И';
			case 'N': return 'Т';
			case 'M': return 'Ь';
			case '<': return 'Б';
			case '>': return 'Ю';
			case '?': return ',';
			
			default: return letter;
		}//end switch(letter)
	}//end public static char QWERTYtoJCUKEN(char letter)
	
	public static char JCUKENtoQWERTY(char letter)
	{
		switch (letter)
		{
			//Lowercase input
			case 'ё': return '`'; 

			case 'й': return 'q';
			case 'ц': return 'w';
			case 'у': return 'e';
			case 'к': return 'r';
			case 'е': return 't'; 
			case 'н': return 'y'; 
			case 'г': return 'u'; 
			case 'ш': return 'i';
			case 'щ': return 'o';
			case 'з': return 'p'; 
			case 'х': return '['; 
			case 'ъ': return ']'; 
			
			case 'ф': return 'a'; 
			case 'ы': return 's'; 
			case 'в': return 'd'; 
			case 'а': return 'f'; 
			case 'п': return 'g'; 
			case 'р': return 'h'; 
			case 'о': return 'j'; 
			case 'л': return 'k'; 
			case 'д': return 'l'; 
			case 'ж': return ':'; 
			case 'э': return '\''; 
			
			case 'я': return 'z';
			case 'ч': return 'x'; 
			case 'с': return 'c'; 
			case 'м': return 'v'; 
			case 'и': return 'b'; 
			case 'т': return 'n'; 
			case 'ь': return 'm'; 
			case 'б': return ','; 
			case 'ю': return '.'; 
			case '.': return '/'; 
			
			// Upper case letters
			case 'Ё': return '~'; 
			case '"': return '@'; 
			case '№': return '#'; 
			case ':': return '^';
			case ';': return '%'; 
			case '?': return '&';
			
			case 'Й': return 'Q'; 
			case 'Ц': return 'W'; 
			case 'У': return 'E'; 
			case 'К': return 'R'; 
			case 'Е': return 'T'; 
			case 'Н': return 'Y'; 
			case 'Г': return 'U'; 
			case 'Ш': return 'I'; 
			case 'Щ': return 'O'; 
			case 'З': return 'P'; 
			case 'Х': return '{'; 
			case 'Ъ': return '}'; 
			case '/': return '|'; 
			
			case 'Ф': return 'A'; 
			case 'Ы': return 'S'; 
			case 'В': return 'D'; 
			case 'А': return 'F'; 
			case 'П': return 'G'; 
			case 'Р': return 'H'; 
			case 'О': return 'J'; 
			case 'Л': return 'K'; 
			case 'Д': return 'L'; 
			case 'Ж': return ';'; 
			case 'Э': return '\"'; 
			
			case 'Я': return 'Z'; 
			case 'Ч': return 'X'; 
			case 'С': return 'C'; 
			case 'М': return 'V'; 
			case 'И': return 'B'; 
			case 'Т': return 'N'; 
			case 'Ь': return 'M'; 
			case 'Б': return '<'; 
			case 'Ю': return '>';
			case ',': return ';';
			
			case '\b': return '\b';
			
			default: return letter;
		}//end switch(letter)
	}//end public static char JCUKENtoQWERTY(char letter)
}
