package org.catrobat.jira.timesheet.services;

import com.atlassian.activeobjects.tx.Transactional;
import org.catrobat.jira.timesheet.activeobjects.Scheduling;

import java.util.Date;

@Transactional
public interface SchedulingService {

    Scheduling getScheduling();

    void setScheduling(int inactiveTime);

    boolean isOlderThanInactiveTime(Date date);
}