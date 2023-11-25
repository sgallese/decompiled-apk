package o4;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private g4.j f20493f;

    /* renamed from: m  reason: collision with root package name */
    private String f20494m;

    /* renamed from: p  reason: collision with root package name */
    private WorkerParameters.a f20495p;

    public l(g4.j jVar, String str, WorkerParameters.a aVar) {
        this.f20493f = jVar;
        this.f20494m = str;
        this.f20495p = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20493f.m().k(this.f20494m, this.f20495p);
    }
}
