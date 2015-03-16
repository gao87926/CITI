package array;

public class Q1_6RotateImage90Degrees {
	public static void rotate(int[][]matrix,int n){
		for(int layer =0;layer<n/2;++layer){
			int first = layer;
			int last = n-1-layer;
			for(int i= first;i<last;++i){
				int offset = i-first;
				//save top
				int top= matrix[first][i];
				//left->top
				matrix[first][i]=matrix[last-offset][first];
				//botton->left
				matrix[last-offset][first]=matrix[last][last-offset];
				//right -> bottom
				matrix[last][last-offset]=matrix[i][last];
				//top->right
				matrix[i][last]=top;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println();
	}
}
