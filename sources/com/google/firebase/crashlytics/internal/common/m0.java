package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import r8.b0;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final o f11443a;

    /* renamed from: b  reason: collision with root package name */
    private final u8.e f11444b;

    /* renamed from: c  reason: collision with root package name */
    private final v8.b f11445c;

    /* renamed from: d  reason: collision with root package name */
    private final q8.c f11446d;

    /* renamed from: e  reason: collision with root package name */
    private final q8.i f11447e;

    m0(o oVar, u8.e eVar, v8.b bVar, q8.c cVar, q8.i iVar) {
        this.f11443a = oVar;
        this.f11444b = eVar;
        this.f11445c = bVar;
        this.f11446d = cVar;
        this.f11447e = iVar;
    }

    private b0.e.d c(b0.e.d dVar) {
        return d(dVar, this.f11446d, this.f11447e);
    }

    private b0.e.d d(b0.e.d dVar, q8.c cVar, q8.i iVar) {
        b0.e.d.b g10 = dVar.g();
        String c10 = cVar.c();
        if (c10 != null) {
            g10.d(b0.e.d.AbstractC0517d.a().b(c10).a());
        } else {
            n8.f.f().i("No log data to include with this event.");
        }
        List<b0.c> k10 = k(iVar.e());
        List<b0.c> k11 = k(iVar.f());
        if (!k10.isEmpty() || !k11.isEmpty()) {
            g10.b(dVar.b().g().c(r8.c0.a(k10)).e(r8.c0.a(k11)).a());
        }
        return g10.a();
    }

    private static b0.a e(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e10) {
            n8.f f10 = n8.f.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb2.append(applicationExitInfo2);
            sb2.append(" Error: ");
            sb2.append(e10);
            f10.k(sb2.toString());
        }
        b0.a.b a10 = b0.a.a();
        importance = applicationExitInfo.getImportance();
        b0.a.b c10 = a10.c(importance);
        processName = applicationExitInfo.getProcessName();
        b0.a.b e11 = c10.e(processName);
        reason = applicationExitInfo.getReason();
        b0.a.b g10 = e11.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        b0.a.b i10 = g10.i(timestamp);
        pid = applicationExitInfo.getPid();
        b0.a.b d10 = i10.d(pid);
        pss = applicationExitInfo.getPss();
        b0.a.b f11 = d10.f(pss);
        rss = applicationExitInfo.getRss();
        return f11.h(rss).j(str).a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static m0 g(Context context, w wVar, u8.f fVar, a aVar, q8.c cVar, q8.i iVar, x8.d dVar, w8.i iVar2, b0 b0Var) {
        return new m0(new o(context, wVar, aVar, dVar, iVar2), new u8.e(fVar, iVar2), v8.b.b(context, iVar2, b0Var), cVar, iVar);
    }

    private ApplicationExitInfo j(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long q10 = this.f11444b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a10 = o4.d.a(it.next());
            timestamp = a10.getTimestamp();
            if (timestamp >= q10) {
                reason = a10.getReason();
                if (reason == 6) {
                    return a10;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    private static List<b0.c> k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(b0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.k0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m10;
                m10 = m0.m((b0.c) obj, (b0.c) obj2);
                return m10;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int m(b0.c cVar, b0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(Task<p> task) {
        if (task.isSuccessful()) {
            p result = task.getResult();
            n8.f.f().b("Crashlytics report successfully enqueued to DataTransport: " + result.d());
            File c10 = result.c();
            if (c10.delete()) {
                n8.f.f().b("Deleted report file: " + c10.getPath());
                return true;
            }
            n8.f.f().k("Crashlytics could not delete report file: " + c10.getPath());
            return true;
        }
        n8.f.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    private void q(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f11444b.y(c(this.f11443a.d(th, thread, str2, j10, 4, 8, z10)), str, str2.equals(AppMeasurement.CRASH_ORIGIN));
    }

    public void h(String str, List<z> list, b0.a aVar) {
        n8.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<z> it = list.iterator();
        while (it.hasNext()) {
            b0.d.b c10 = it.next().c();
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        this.f11444b.l(str, b0.d.a().b(r8.c0.a(arrayList)).a(), aVar);
    }

    public void i(long j10, String str) {
        this.f11444b.k(str, j10);
    }

    public boolean l() {
        return this.f11444b.r();
    }

    public SortedSet<String> n() {
        return this.f11444b.p();
    }

    public void o(String str, long j10) {
        this.f11444b.z(this.f11443a.e(str, j10));
    }

    public void r(Throwable th, Thread thread, String str, long j10) {
        n8.f.f().i("Persisting fatal event for session " + str);
        q(th, thread, str, AppMeasurement.CRASH_ORIGIN, j10, true);
    }

    public void s(Throwable th, Thread thread, String str, long j10) {
        n8.f.f().i("Persisting non-fatal event for session " + str);
        q(th, thread, str, "error", j10, false);
    }

    public void t(String str, List<ApplicationExitInfo> list, q8.c cVar, q8.i iVar) {
        ApplicationExitInfo j10 = j(str, list);
        if (j10 == null) {
            n8.f.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        b0.e.d c10 = this.f11443a.c(e(j10));
        n8.f.f().b("Persisting anr for session " + str);
        this.f11444b.y(d(c10, cVar, iVar), str, true);
    }

    public void u() {
        this.f11444b.i();
    }

    public Task<Void> v(Executor executor) {
        return w(executor, null);
    }

    public Task<Void> w(Executor executor, String str) {
        boolean z10;
        List<p> w10 = this.f11444b.w();
        ArrayList arrayList = new ArrayList();
        for (p pVar : w10) {
            if (str == null || str.equals(pVar.d())) {
                v8.b bVar = this.f11445c;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(bVar.c(pVar, z10).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.l0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean p10;
                        p10 = m0.this.p(task);
                        return Boolean.valueOf(p10);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
