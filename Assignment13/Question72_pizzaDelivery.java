package assignments.Assignment13;

public class Question72_pizzaDelivery {

	public static void main(String[] args) {
		/*
		 * A pizza delivery man has a scooter and a lot of deliveries to make, he will have to refuel a few times.
		 * Refuel_times gets an ArrayList deliveries of the amount of fuel it will take to get to destinations like:
		 * [1,3,5], first place will take 1 fuel unit to get to the second 3 fuel units etc...
		 * the max_fuel is the max fuel units in the vehicle fuel tank.
		 * you will need to returns how meany refuels it will take to do all deliveries 
		 * (if the units are bigger then the tank he will refuel along the way in a gas station).

for example:

refuel_times([7,7,7],7)
returns:3 (3 fuel stops 7 units each delivery)

refuel_times([9,1],3)
returns:4 (3 fuel stops for first delivery and +1 stop for second)

refuel_times([100,200,10],10)
returns:31
		 */
		int [] array1 = {7,7,7};
		int [] array2 = {9,1};
		int [] array3 = {100,200,10};
		
		int max1 = 7;
		int max2 = 3;
		int max3 = 10;
		
		System.out.println(refuel_times(array1, max1));
		System.out.println(refuel_times(array2, max2));
		System.out.println(refuel_times(array3, max3));
	}
	public static int refuel_times(int[] arr, int max_fuel) {
		
		int sum = 0;
		
		for(int i = 0;    i<arr.length;   i++ ){
			
			sum += Math.ceil((double)arr[i]/max_fuel);
		}
		return sum;
	}

}
