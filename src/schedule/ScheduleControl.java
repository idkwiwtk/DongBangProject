package schedule;

import java.util.Vector;

public class ScheduleControl {
	private Vector<BookSchedule> scheduleArr;
	
	public void addSchedule(BookSchedule b)
	{
		scheduleArr.add(b);
	}
	
	public Vector<BookSchedule> getSchedule()
	{
		return scheduleArr;  
	}
	
	public ScheduleControl()
	{
		scheduleArr = new Vector<BookSchedule>();
	}
}
