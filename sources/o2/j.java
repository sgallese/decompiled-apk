package o2;

import java.util.Arrays;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class j extends e implements i {

    /* renamed from: w0  reason: collision with root package name */
    public e[] f20464w0 = new e[4];

    /* renamed from: x0  reason: collision with root package name */
    public int f20465x0 = 0;

    @Override // o2.i
    public void a() {
        this.f20465x0 = 0;
        Arrays.fill(this.f20464w0, (Object) null);
    }

    @Override // o2.i
    public void b(e eVar) {
        if (eVar != this && eVar != null) {
            int i10 = this.f20465x0 + 1;
            e[] eVarArr = this.f20464w0;
            if (i10 > eVarArr.length) {
                this.f20464w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.f20464w0;
            int i11 = this.f20465x0;
            eVarArr2[i11] = eVar;
            this.f20465x0 = i11 + 1;
        }
    }

    @Override // o2.i
    public void c(f fVar) {
    }
}
