package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.l;
import g4.b;
import g4.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: p  reason: collision with root package name */
    private static final String f7517p = l.f("SystemJobService");

    /* renamed from: f  reason: collision with root package name */
    private j f7518f;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, JobParameters> f7519m = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        JobParameters remove;
        l.c().a(f7517p, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f7519m) {
            remove = this.f7519m.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            j k10 = j.k(getApplicationContext());
            this.f7518f = k10;
            k10.m().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                l.c().h(f7517p, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.f7518f;
        if (jVar != null) {
            jVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        Network network;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        if (this.f7518f == null) {
            l.c().a(f7517p, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            l.c().b(f7517p, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f7519m) {
            if (this.f7519m.containsKey(a10)) {
                l.c().a(f7517p, String.format("Job is already being executed by SystemJobService: %s", a10), new Throwable[0]);
                return false;
            }
            l.c().a(f7517p, String.format("onStartJob for %s", a10), new Throwable[0]);
            this.f7519m.put(a10, jobParameters);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                triggeredContentUris = jobParameters.getTriggeredContentUris();
                if (triggeredContentUris != null) {
                    triggeredContentUris2 = jobParameters.getTriggeredContentUris();
                    aVar.f7397b = Arrays.asList(triggeredContentUris2);
                }
                triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
                if (triggeredContentAuthorities != null) {
                    triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
                    aVar.f7396a = Arrays.asList(triggeredContentAuthorities2);
                }
                if (i10 >= 28) {
                    network = jobParameters.getNetwork();
                    aVar.f7398c = network;
                }
            } else {
                aVar = null;
            }
            this.f7518f.v(a10, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f7518f == null) {
            l.c().a(f7517p, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a10 = a(jobParameters);
        if (TextUtils.isEmpty(a10)) {
            l.c().b(f7517p, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        l.c().a(f7517p, String.format("onStopJob for %s", a10), new Throwable[0]);
        synchronized (this.f7519m) {
            this.f7519m.remove(a10);
        }
        this.f7518f.x(a10);
        return !this.f7518f.m().f(a10);
    }
}
