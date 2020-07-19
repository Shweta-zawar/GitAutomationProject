package javaPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRead {

	public static void main(String[] args)throws IOException {
		
			ArrayList<Integer> arr = new ArrayList<Integer>();
			Scanner sc = new Scanner(System.in);
			while(true) {
				int n = sc.nextInt();
				arr.add(n);
				if(n<0) {
					break;
				}
				System.out.println();
			}
			int count = processArray(arr);
			System.out.println(count);
		}

		public static int processArray(ArrayList<Integer> arr) {
			int count = 0;
			
//			for(int ind = 0; ind < arr.size(); ind++) {
//				if(arr.get(ind) >= 10) {
//					count++;
//				}
//			}
			
			count = (int) arr.stream().filter(n->n>=10).count();
			
			return count;
		}

	}


