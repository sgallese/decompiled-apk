package i4;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.d;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    private static final String f16956b = androidx.work.l.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f16957a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemJobInfoConverter.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16958a;

        static {
            int[] iArr = new int[androidx.work.m.values().length];
            f16958a = iArr;
            try {
                iArr[androidx.work.m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16958a[androidx.work.m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16958a[androidx.work.m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16958a[androidx.work.m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16958a[androidx.work.m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context) {
        this.f16957a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        boolean b10 = aVar.b();
        k.a();
        return j.a(aVar.a(), b10 ? 1 : 0);
    }

    static int c(androidx.work.m mVar) {
        int i10 = a.f16958a[mVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        androidx.work.l.c().a(f16956b, String.format("API version too low. Cannot convert network type value %s", mVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, androidx.work.m mVar) {
        if (Build.VERSION.SDK_INT >= 30 && mVar == androidx.work.m.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(mVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobInfo a(n4.p pVar, int i10) {
        int i11;
        androidx.work.c cVar = pVar.f20201j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f20192a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f16957a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.b());
        boolean z10 = false;
        if (!cVar.h()) {
            if (pVar.f20203l == androidx.work.a.LINEAR) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            extras.setBackoffCriteria(pVar.f20204m, i11);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f20208q) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 >= 24 && cVar.e()) {
            Iterator<d.a> it = cVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        if (pVar.f20202k > 0) {
            z10 = true;
        }
        if (androidx.core.os.a.b() && pVar.f20208q && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
