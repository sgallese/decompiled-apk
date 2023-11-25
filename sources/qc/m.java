package qc;

/* compiled from: FunctionReference.java */
/* loaded from: classes4.dex */
public class m extends d implements l, wc.d {

    /* renamed from: u  reason: collision with root package name */
    private final int f21684u;

    /* renamed from: v  reason: collision with root package name */
    private final int f21685v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f21684u = r9
            int r9 = r14 >> 1
            r8.f21685v = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.m.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // qc.d
    protected wc.a b() {
        return g0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (d().equals(mVar.d()) && g().equals(mVar.g()) && this.f21685v == mVar.f21685v && this.f21684u == mVar.f21684u && q.d(c(), mVar.c()) && q.d(e(), mVar.e())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof wc.d)) {
            return false;
        } else {
            return obj.equals(a());
        }
    }

    @Override // qc.l
    public int getArity() {
        return this.f21684u;
    }

    public int hashCode() {
        int hashCode;
        if (e() == null) {
            hashCode = 0;
        } else {
            hashCode = e().hashCode() * 31;
        }
        return ((hashCode + d().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        wc.a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        if ("<init>".equals(d())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + d() + " (Kotlin reflection is not available)";
    }
}
