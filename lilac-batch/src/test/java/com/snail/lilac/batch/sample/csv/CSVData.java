package com.snail.lilac.batch.sample.csv;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Andy
 */
@Component("csvData")
@Scope("prototype")
public class CSVData {

    private String id;
    private String name;
    private String course;
    private String score;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the score
     */
    public String getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(String score) {
        this.score = score;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CSVData [id=" + id + ", name=" + name + ", course=" + course + ", score=" + score + "]";
    }

}
