package trainingAssignment9;

class Theatre{
	void Shows() {
		System.out.println("Available Shows: Action Movies, Rom Com Movies, Broadway Musical, Plays");
		
		RomCom rc = new RomCom();
		rc.timeslots();
		
		class Action{
			void showtimes() {
				System.out.println("Available times for Action movies: 11:00 AM, 12:30PM, 3:00PM, 7:00PM");
			}
		}
		Action a = new Action();
		a.showtimes();
	}
	
	class RomCom{
		void timeslots() {
			System.out.println("Available times for RomCom movies: 9:40AM, 11:30 AM, 12:45PM, 3:00PM, 5:30 PM, 7:15PM");
		}
	}
	
	class Plays{
		void schedule() {
			System.out.println("Available times for Plays: 3:30PM, 4:00PM, 5:45PM, 6:45PM");
		}
	}
	
	static class Broadway{
		static void time() {
			System.out.println("Available times for Braodway Musicals: 4:00 PM, 6:00 PM, 7:45PM, 9:00PM");
		}
	}
}

abstract class LiveShows{
	abstract void eventtime();
}

public class InnerClass2 {

	public static void main(String[] args) {
		
		Theatre t = new Theatre();
		t.Shows();
		Theatre.Plays pl = t.new Plays();
		pl.schedule();
		Theatre.Broadway.time();
		LiveShows live = new LiveShows() {
			void eventtime() {
				System.out.println("The live Concert starts at 5:00PM on Feb 14th, 2021");
			}
		};
		live.eventtime();

	}

}
