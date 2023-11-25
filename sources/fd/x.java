package fd;

import ad.c1;
import ad.i2;
import ad.t0;
import kotlin.KotlinNothingValueException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
/* loaded from: classes4.dex */
public final class x extends i2 implements t0 {

    /* renamed from: m  reason: collision with root package name */
    private final Throwable f15685m;

    /* renamed from: p  reason: collision with root package name */
    private final String f15686p;

    public x(Throwable th, String str) {
        this.f15685m = th;
        this.f15686p = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void R0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f15685m
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f15686p
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f15685m
            r1.<init>(r0, r2)
            throw r1
        L36:
            fd.w.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.x.R0():java.lang.Void");
    }

    @Override // ad.g0
    public boolean D0(hc.f fVar) {
        R0();
        throw new KotlinNothingValueException();
    }

    @Override // ad.i2, ad.g0
    public ad.g0 F0(int i10) {
        R0();
        throw new KotlinNothingValueException();
    }

    @Override // ad.g0
    /* renamed from: N0  reason: merged with bridge method [inline-methods] */
    public Void A0(hc.f fVar, Runnable runnable) {
        R0();
        throw new KotlinNothingValueException();
    }

    @Override // ad.t0
    /* renamed from: T0  reason: merged with bridge method [inline-methods] */
    public Void j(long j10, ad.m<? super dc.w> mVar) {
        R0();
        throw new KotlinNothingValueException();
    }

    @Override // ad.t0
    public c1 p0(long j10, Runnable runnable, hc.f fVar) {
        R0();
        throw new KotlinNothingValueException();
    }

    @Override // ad.i2, ad.g0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f15685m != null) {
            str = ", cause=" + this.f15685m;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // ad.i2
    public i2 I0() {
        return this;
    }
}
