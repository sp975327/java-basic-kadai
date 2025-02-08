package kadai_015;

public class Car_Chapter15 {
		// フィールド（内部データ）
		private int	pregear = 1;
		private int	gear = 1;
		private int speed = 10;
		
		// コンストラクタ（初期化処理）
	    public Car_Chapter15 ( int gear, int speed ) {
	        this.gear  = gear;
	        this.speed = speed;
	    }

	    //ギアに応じた速度
		public void gearChange(int afterGear) {
			this.pregear = this.gear;
			this.gear = afterGear;
			switch(this.gear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
				default -> this.speed = 10;
			}
		}
		
		//runメソッド
		public void run() {
			System.out.println("ギア" + this.pregear + "から" + this.gear + "に切り替えられました");
			System.out.println("速度は時速" + this.speed + "kmです");
		}
}


