package v1;

import com.google.android.gms.common.internal.ImagesContract;

/* compiled from: UrlAnnotation.kt */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f24486a;

    public n0(String str) {
        qc.q.i(str, ImagesContract.URL);
        this.f24486a = str;
    }

    public final String a() {
        return this.f24486a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n0) && qc.q.d(this.f24486a, ((n0) obj).f24486a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f24486a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f24486a + ')';
    }
}
