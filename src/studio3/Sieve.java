package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the max range you want to find prime numbers for?");
		int n = in.nextInt();
		boolean[] isPrime = new boolean[n+1];
		for(int i=2; i<=n; i++) {
			isPrime[i]=true;
		
			}
		for(int j=2; j*j<=n; j++) {
			if(isPrime[j]) {
				for(int k=j*j;k<=n; k+=j ) {
					isPrime[k]=false;
					//System.out.print(k);
				}
			}
		}
		System.out.println("Prime numbers up to " + n + ":");
		for(int i=2; i<=n; i++) {
			if(isPrime[i]==true) {
				System.out.println(i+ " ");
			}
		}
		}
		
		
	}


