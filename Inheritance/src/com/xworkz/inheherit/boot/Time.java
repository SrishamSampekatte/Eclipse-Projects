package com.xworkz.inheherit.boot;



		public class Time {

		    int seconds;
		    int minutes;
		    int hours;

		    public Time(int hours, int minutes, int seconds) {
		        this.hours = hours;
		        this.minutes = minutes;
		        this.seconds = seconds;
		    }

		    public static void main(String[] args) {

		      // create objects of Time class
		        Time start = new Time(9, 45, 56);
		        Time stop = new Time(15, 45, 56);
		        Time diff;

		        // call difference method
		        diff = difference(start, stop);

		  //      System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
		//        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
		        System.out.printf(" %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
		    }

		    public static Time difference(Time start, Time stop)
		    {
		        Time diff = new Time(00,00,00);

		        // if start second is greater
		        // convert minute of stop into seconds
		        // and add seconds to stop second
		        if(start.seconds > stop.seconds){
		            --stop.minutes;
		            stop.seconds += 60;
		        }

		        diff.seconds = stop.seconds - start.seconds;

		        // if start minute is greater
		        // convert stop hour into minutes
		        // and add minutes to stop minutes
		        if(start.minutes > stop.minutes){
		            --stop.hours;
		            stop.minutes += 60;
		        }

		        diff.minutes = stop.minutes - start.minutes;
		        diff.hours = stop.hours - start.hours;

		        // return the difference time
		        return(diff);
		    }
		

	}


