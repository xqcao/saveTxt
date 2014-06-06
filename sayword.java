import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class sayword {

	private static void output2txt(String[] Obj,int l, String filename) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(filename));
			for(int i =0; i< l; i++) {
				out.write(Obj[i]);
				out.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					System.err.print("BufferedWriter close err" + e);
				}			
			}
		}
	}
	public static void main(String[] args) {
		String[] st ={args[0],args[1],args[2]};		
		String savepath = "/home/xqcao/Documents/java2jar/aaa";		
		output2txt(st,st.length,savepath);
	}
}