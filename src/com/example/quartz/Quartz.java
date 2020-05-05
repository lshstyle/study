package com.example.quartz;

import static org.quartz.JobBuilder.newJob;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDetail;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import static org.quartz.DateBuilder.evenSecondDateAfterNow;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class Quartz {

	public static void main(String[] args) throws SchedulerException {
		// TODO Auto-generated method stub
		Quartz quartz = new Quartz(); 
		quartz.run();
	}
	
	public void run() throws SchedulerException {
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		JobDetail job = newJob(MyJob.class).withIdentity("myJob", "myGroup").build();
		Date runTime = evenSecondDateAfterNow();
		Trigger trigger = newTrigger().withIdentity("myTrigger", "myGroup").startAt(runTime)
				.withSchedule(simpleSchedule().withIntervalInSeconds(5).withRepeatCount(3)).build();
		scheduler.scheduleJob(job, trigger);
		scheduler.start();
		
		try {
			Thread.sleep(100L*1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scheduler.shutdown();
	}

}

class MyJob implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("MyJob execute");
	}
	
}
