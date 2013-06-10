
public class runner {

	public static void paintFill(int[][]color, int x, int y, int ocolor, int tcolor) {
		if(x<0||y<0||x>color[0].length||y>color.length)
			return;
		
		if(color[x][y]==ocolor)
			color[x][y]=tcolor;
		paintFill(color,x-1,y,ocolor,tcolor);
		paintFill(color,x,y-1,ocolor,tcolor);
		paintFill(color,x+1,y,ocolor,tcolor);
		paintFill(color,x,y+1,ocolor,tcolor);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
