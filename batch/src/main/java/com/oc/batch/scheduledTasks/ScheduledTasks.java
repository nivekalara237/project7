package com.oc.batch.scheduledTasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.oc.batch.dao.LoanDao;
import com.oc.batch.model.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    @Autowired
    LoanDao loanDao;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 60*1000)
//    public void reportCurrentTime() {
//        log.info("The time is now {}", dateFormat.format(new Date()));
//    }

//    @Scheduled(fixedRate = 60*1000)
//    public void reportNotReturnedBook(){
//        List<Loan> loans = loanDao.findByNotReturnedandAndDateEnd();
//        for(int i=0; i<loans.size();i++) {
//            log.info("[BATCH]"+
//            "\n------------------------------------------------\n" +
//                    "Le prêt du livre " +
//                    loans.get(i).getBook().getTitle()+
//                    " arrive à sa fin ! \n" +
//                    "Emprunté par " +
//                    loans.get(i).getUser().getName()+
//                    ". \n" +
//                    "Date de retour: " +
//                    loans.get(i).getDateEnd()+
//                    "\nMail envoyé à "+
//                    loans.get(i).getUser().getMail()+
//                    "\n------------------------------------------------\n");
//        }
//    }
}
