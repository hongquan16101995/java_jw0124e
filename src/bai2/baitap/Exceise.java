package bai2.baitap;

public class Exceise {
	public static void main(String[] args) {
		// viết chương trình tính tổng các
		// số nguyên tố nhỏ hơn 500
		// 8h15 check bài tập
		// 21538
		// 21536

		// SNT là số chỉ chia hết cho 1 và chính
		// 2 phương án:
		// PA1: chia số N cho các số từ 1 => N, đếm ước
		// nếu số ước = 2 => N là SNT
		// PA2: chia số N cho các số từ 2 => N - 1
		// nếu trong quá trình chia, có chia hết => N không phải SNT

		int N = 1;
		int sum = 0;
		while (N < 500) {
			if (N < 2) {
				N++;
				continue;
			} else {
				boolean flag = true;
				for (int i = 2; i < N; i++) {
					if (N % i == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					sum += N;
				}
			}
			N++;
		}
		System.out.println(sum);
	}

}
