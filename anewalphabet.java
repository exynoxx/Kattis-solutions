import java.util.Scanner;

/**
 * Created by nicholas on 02/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		String[] ASCII = new String[126];

		/*
		for (int i = 0; i < 32; i++) ASCII[i] = "0";

		ASCII[32]=" ";
		ASCII[33]="!";
		ASCII[34]="\"";
		ASCII[35]="#";
		ASCII[36]="$";
		ASCII[37]="%";
		ASCII[38]="&";
		ASCII[39]="'";
		ASCII[40]="(";
		ASCII[41]=")";
		ASCII[42]="*";
		ASCII[43]="+";
		ASCII[44]=",";
		ASCII[45]="-";
		ASCII[46]=".";
		ASCII[47]="/";

		for (int i = 48; i < 10; i++) {
			ASCII[i] = String.valueOf(i - 48);
		}
		*/

		/*
		ASCII[58]=":";
		ASCII[59]=";";
		ASCII[60]="<";
		ASCII[61]="=";
		ASCII[62]=">";
		ASCII[63]="?";
		ASCII[64]="@";
*/
		ASCII[65]="@";
		ASCII[66]="8";
		ASCII[67]="(";
		ASCII[68]="|)";
		ASCII[69]="3";
		ASCII[70]="#";
		ASCII[71]="6";
		ASCII[72]="[-]";
		ASCII[73]="|";
		ASCII[74]="_|";
		ASCII[75]="|<";
		ASCII[76]="1";
		ASCII[77]="[]\\/[]";
		ASCII[78]="[]\\[]";
		ASCII[79]="0";
		ASCII[80]="|D";
		ASCII[81]="(,)";
		ASCII[82]="|Z";
		ASCII[83]="$";
		ASCII[84]="']['";
		ASCII[85]="|_|";
		ASCII[86]="\\/";
		ASCII[87]="\\/\\/";
		ASCII[88]="}{";
		ASCII[89]="`/";
		ASCII[90]="2";

		ASCII[97]="@";
		ASCII[98]="8";
		ASCII[99]="(";
		ASCII[100]="|)";
		ASCII[101]="3";
		ASCII[102]="#";
		ASCII[103]="6";
		ASCII[104]="[-]";
		ASCII[105]="|";
		ASCII[106]="_|";
		ASCII[107]="|<";
		ASCII[108]="1";
		ASCII[109]="[]\\/[]";
		ASCII[110]="[]\\[]";
		ASCII[111]="0";
		ASCII[112]="|D";
		ASCII[113]="(,)";
		ASCII[114]="|Z";
		ASCII[115]="$";
		ASCII[116]="']['";
		ASCII[117]="|_|";
		ASCII[118]="\\/";
		ASCII[119]="\\/\\/";
		ASCII[120]="}{";
		ASCII[121]="`/";
		ASCII[122]="2";

		for (char c : input.toCharArray())
		{
			int v = (int) c;
			if (v >= 65 && v <= 90 || v >= 97 && v <= 122)
			{
				System.out.print(ASCII[v]);
			} else
				System.out.print(c);
		}

	}
}
