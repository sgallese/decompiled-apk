package y4;

import android.net.Uri;
import b5.l;
import qc.q;

/* compiled from: UriKeyer.kt */
/* loaded from: classes.dex */
public final class c implements b<Uri> {
    @Override // y4.b
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public String a(Uri uri, l lVar) {
        if (q.d(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            sb2.append(g5.l.k(lVar.g().getResources().getConfiguration()));
            return sb2.toString();
        }
        return uri.toString();
    }
}
