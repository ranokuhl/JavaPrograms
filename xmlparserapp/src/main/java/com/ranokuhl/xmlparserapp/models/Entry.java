package com.ranokuhl.xmlparserapp.models;

public class Entry
{
    private String id;
    private String owner;
    private String reported_date;
    private String summary;
    private String country;
    private String incident_type;
    private String vendor_ticket_number;
    private String incident_association_type;
    private String priority;
    private String site;
    private String svt_due_date;
    private String incident_id;
    private String service;
    private String assigned_group;
    private String assignee;
    private String owner_group;
    private String status_reason;
    private String last_modified;
    private String measurement_status;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getReported_date() {
        return reported_date;
    }

    public void setReported_date(String reported_date) {
        this.reported_date = reported_date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIncident_type() {
        return incident_type;
    }

    public void setIncident_type(String incident_type) {
        this.incident_type = incident_type;
    }

    public String getVendor_ticket_number() {
        return vendor_ticket_number;
    }

    public void setVendor_ticket_number(String vendor_ticket_number) {
        this.vendor_ticket_number = vendor_ticket_number;
    }

    public String getIncident_association_type() {
        return incident_association_type;
    }

    public void setIncident_association_type(String incident_association_type) {
        this.incident_association_type = incident_association_type;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSvt_due_date() {
        return svt_due_date;
    }

    public void setSvt_due_date(String svt_due_date) {
        this.svt_due_date = svt_due_date;
    }

    public String getIncident_id() {
        return incident_id;
    }

    public void setIncident_id(String incident_id) {
        this.incident_id = incident_id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAssigned_group() {
        return assigned_group;
    }

    public void setAssigned_group(String assigned_group) {
        this.assigned_group = assigned_group;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getOwner_group() {
        return owner_group;
    }

    public void setOwner_group(String owner_group) {
        this.owner_group = owner_group;
    }

    public String getStatus_reason() {
        return status_reason;
    }

    public void setStatus_reason(String status_reason) {
        this.status_reason = status_reason;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getMeasurement_status() {
        return measurement_status;
    }

    public void setMeasurement_status(String measurement_status) {
        this.measurement_status = measurement_status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", reported_date='" + reported_date + '\'' +
                ", summary='" + summary + '\'' +
                ", country='" + country + '\'' +
                ", incident_type='" + incident_type + '\'' +
                ", vendor_ticket_number='" + vendor_ticket_number + '\'' +
                ", incident_association_type='" + incident_association_type + '\'' +
                ", priority='" + priority + '\'' +
                ", site='" + site + '\'' +
                ", svt_due_date='" + svt_due_date + '\'' +
                ", incident_id='" + incident_id + '\'' +
                ", service='" + service + '\'' +
                ", assigned_group='" + assigned_group + '\'' +
                ", assignee='" + assignee + '\'' +
                ", owner_group='" + owner_group + '\'' +
                ", status_reason='" + status_reason + '\'' +
                ", last_modified='" + last_modified + '\'' +
                ", measurement_status='" + measurement_status + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}