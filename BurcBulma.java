import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
		int day, month;
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n Hangi gün doğdunuz? ");
		day = input.nextInt();
		System.out.print("\n Hangi ay doğdunuz? ");
		month = input.nextInt();
		
		if (month == 1) {
			if (day >= 1  && day <= 21) {
			System.out.println("\n Oğlak burcusunuz.");
			} else if (day > 21 && day <= 31) {
			System.out.println("\n Kova burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 2) {
			if (day >= 1  && day <= 19) {
			System.out.println("\n Kova burcusunuz.");
			} else if (day > 20 && day <= 28) {
			System.out.println("\n Balık burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 3) {
			if (day >= 1  && day <= 20) {
			System.out.println("\n Balık burcusunuz.");
			} else if (day > 20 && day <= 31) {
			System.out.println("\n Koç burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 4) {
			if (day >= 1  && day <= 20) {
			System.out.println("\n Koç burcusunuz.");
			} else if (day > 20 && day <= 30) {
			System.out.println("\n Boğa burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 5) {
			if (day >= 1  && day <= 21) {
			System.out.println("\n Boğa burcusunuz.");
			} else if (day > 21 && day <= 31) {
			System.out.println("\n İkizler burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 6) {
			if (day >= 1  && day <= 22) {
			System.out.println("\n İkizler burcusunuz.");
			} else if (day > 22 && day <= 31) {
			System.out.println("\n Yengeç burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 7) {
			if (day >= 1  && day <= 22) {
			System.out.println("\n Yengeç burcusunuz.");
			} else if (day > 22 && day <= 31) {
			System.out.println("\n Aslan burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 8) {
			if (day >= 1  && day <= 23) {
			System.out.println("\n Aslan burcusunuz.");
			} else if (day > 23 && day <= 31) {
			System.out.println("\n Başak burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 9) {
			if (day >= 1  && day <= 22) {
			System.out.println("\n Başak burcusunuz.");
			} else if (day > 22 && day <= 30) {
			System.out.println("\n Terazi burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 10) {
			if (day >= 1  && day <= 22) {
			System.out.println("\n Terazi burcusunuz.");
			} else if (day > 22 && day <= 31) {
			System.out.println("\n Akrep burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 11) {
			if (day >= 1  && day <= 21) {
			System.out.println("\n Akrep burcusunuz.");
			} else if (day > 21 && day <= 30) {
			System.out.println("\n Yay burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
		
		if (month == 12) {
			if (day >= 1  && day <= 21) {
			System.out.println("\n Yay burcusunuz.");
			} else if (day > 21 && day <= 31) {
			System.out.println("\n Oğlak burcusunuz.");
			} else {
			System.out.println("\n Doğum tarihinizi doğru girdiğinizden emin olun.");	
			}
		
		}
	}
}
