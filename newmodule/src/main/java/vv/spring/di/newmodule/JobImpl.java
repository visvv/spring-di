package vv.spring.di.newmodule;

/**
 * Created by vasudvis on 5/20/2017.
 */

import org.springframework.stereotype.Service;
import vv.spring.di.base.Job;


@Service
public class JobImpl implements Job {
    public void doJob() {
        System.out.println("Doing job....");
    }
}
