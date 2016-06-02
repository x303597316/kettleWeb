package org.flhy.ext.job.steps;

import java.util.List;

import org.flhy.ext.job.step.AbstractJobEntry;
import org.pentaho.di.core.Const;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.job.entry.JobEntryInterface;
import org.pentaho.metastore.api.IMetaStore;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxUtils;

@Component("FTP_PUT")
@Scope("prototype")
public class JobEntryFTP_PUT extends AbstractJobEntry{
	@Override
	public void decode(JobEntryInterface jobEntry, mxCell cell, List<DatabaseMeta> databases, IMetaStore metaStore) throws Exception {
//		org.pentaho.di.job.entries.special.JobEntrySpecial jobEntrySpecial = (org.pentaho.di.job.entries.special.JobEntrySpecial) jobEntry;
//		jobEntrySpecial.setRepeat("Y".equalsIgnoreCase(cell.getAttribute("repeat")));
//		jobEntrySpecial.setSchedulerType(Const.toInt( cell.getAttribute( "schedulerType" ), 
//				org.pentaho.di.job.entries.special.JobEntrySpecial.NOSCHEDULING ));
//		
//		jobEntrySpecial.setIntervalSeconds( Const.toInt( cell.getAttribute( "intervalSeconds" ), 0 ) );
//		jobEntrySpecial.setIntervalMinutes( Const.toInt( cell.getAttribute( "intervalMinutes" ), 0 ) );
//		jobEntrySpecial.setHour( Const.toInt( cell.getAttribute( "hour" ), 0 ) );
//		jobEntrySpecial.setMinutes( Const.toInt( cell.getAttribute( "minutes" ), 0 ) );
//		jobEntrySpecial.setWeekDay( Const.toInt( cell.getAttribute( "weekDay" ), 0 ) );
//		jobEntrySpecial.setDayOfMonth( Const.toInt( cell.getAttribute( "dayOfMonth" ), 0 ) );
	}

	@Override
	public Element encode(JobEntryInterface jobEntry) throws Exception {
//		org.pentaho.di.job.entries.special.JobEntrySpecial jobEntrySpecial = (org.pentaho.di.job.entries.special.JobEntrySpecial) jobEntry;
		Document doc = mxUtils.createDocument();
		Element e = doc.createElement("Step");
		
//		e.setAttribute("repeat", jobEntrySpecial.isRepeat() ? "Y" : "N");
//		e.setAttribute("schedulerType", jobEntrySpecial.getSchedulerType() + "");
//		e.setAttribute("intervalSeconds", jobEntrySpecial.getIntervalSeconds() + "");
//		e.setAttribute("intervalMinutes", jobEntrySpecial.getIntervalMinutes() + "");
//		e.setAttribute("hour", jobEntrySpecial.getHour() + "");
//		e.setAttribute("minutes", jobEntrySpecial.getMinutes() + "");
//		e.setAttribute("weekDay", jobEntrySpecial.getWeekDay() + "");
//		e.setAttribute("DayOfMonth", jobEntrySpecial.getDayOfMonth() + "");
		
		return e;
	}

}
