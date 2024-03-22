package com.konfigthis.client;

import com.konfigthis.client.api.ArchivingApi;
import com.konfigthis.client.api.CloudRecordingApi;
import com.konfigthis.client.api.DevicesApi;
import com.konfigthis.client.api.H323DevicesApi;
import com.konfigthis.client.api.MeetingsApi;
import com.konfigthis.client.api.PacApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.SipPhoneApi;
import com.konfigthis.client.api.TspApi;
import com.konfigthis.client.api.TrackingFieldApi;
import com.konfigthis.client.api.WebinarsApi;

public class ZoomMeeting {
    private ApiClient apiClient;
    public final ArchivingApi archiving;
    public final CloudRecordingApi cloudRecording;
    public final DevicesApi devices;
    public final H323DevicesApi h323Devices;
    public final MeetingsApi meetings;
    public final PacApi pac;
    public final ReportsApi reports;
    public final SipPhoneApi sipPhone;
    public final TspApi tsp;
    public final TrackingFieldApi trackingField;
    public final WebinarsApi webinars;

    public ZoomMeeting() {
        this(null);
    }

    public ZoomMeeting(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.archiving = new ArchivingApi(this.apiClient);
        this.cloudRecording = new CloudRecordingApi(this.apiClient);
        this.devices = new DevicesApi(this.apiClient);
        this.h323Devices = new H323DevicesApi(this.apiClient);
        this.meetings = new MeetingsApi(this.apiClient);
        this.pac = new PacApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.sipPhone = new SipPhoneApi(this.apiClient);
        this.tsp = new TspApi(this.apiClient);
        this.trackingField = new TrackingFieldApi(this.apiClient);
        this.webinars = new WebinarsApi(this.apiClient);
    }

}
