package e1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PathParser.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f13870a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final d f13871b = new d(0.0f, false, 3, null);

    /* renamed from: c  reason: collision with root package name */
    private float[] f13872c = new float[64];

    public final k a(String str) {
        int i10;
        char charAt;
        qc.q.i(str, "pathData");
        this.f13870a.clear();
        int length = str.length();
        int i11 = 0;
        while (i11 < length && qc.q.k(str.charAt(i11), 32) <= 0) {
            i11++;
        }
        while (length > i11 && qc.q.k(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i12 = 0;
        while (i11 < length) {
            while (true) {
                i10 = i11 + 1;
                charAt = str.charAt(i11);
                int i13 = charAt | ' ';
                if ((i13 - 97) * (i13 - 122) <= 0 && i13 != 101) {
                    break;
                } else if (i10 >= length) {
                    charAt = 0;
                    break;
                } else {
                    i11 = i10;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i12 = 0;
                    while (true) {
                        if (i10 < length && qc.q.k(str.charAt(i10), 32) <= 0) {
                            i10++;
                        } else {
                            i10 = c.f13736a.a(str, i10, length, this.f13871b);
                            if (this.f13871b.b()) {
                                int i14 = i12 + 1;
                                this.f13872c[i12] = this.f13871b.a();
                                float[] fArr = this.f13872c;
                                if (i14 >= fArr.length) {
                                    float[] fArr2 = new float[i14 * 2];
                                    this.f13872c = fArr2;
                                    ec.o.f(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i12 = i14;
                            }
                            while (i10 < length && str.charAt(i10) == ',') {
                                i10++;
                            }
                            if (i10 >= length || !this.f13871b.b()) {
                                break;
                            }
                        }
                    }
                }
                j.a(charAt, this.f13870a, this.f13872c, i12);
            }
            i11 = i10;
        }
        return this;
    }

    public final List<i> b() {
        return this.f13870a;
    }
}
