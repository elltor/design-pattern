package com.elltor.designpattern.visitor.report_demo;

import java.util.ArrayList;
import java.util.List;

public class ReportManager{
    private List<Reporter> reporters = new ArrayList<>();

    public void attach(Reporter report){
        reporters.add(report);
    }

    public void detach(Reporter report){
        reporters.remove(report);
    }

    public void accept(Leader leader){
        for(Reporter r : reporters){
            r.accept(leader);
        }
    }

}
