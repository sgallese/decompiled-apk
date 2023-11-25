package z4;

import android.net.Uri;
import g5.l;
import java.io.File;
import qc.q;
import yc.w;

/* compiled from: FileUriMapper.kt */
/* loaded from: classes.dex */
public final class b implements d<Uri, File> {
    private final boolean b(Uri uri) {
        boolean z10;
        boolean C0;
        if (l.q(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !q.d(scheme, "file")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        C0 = w.C0(path, '/', false, 2, null);
        if (!C0 || l.h(uri) == null) {
            return false;
        }
        return true;
    }

    @Override // z4.d
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public File a(Uri uri, b5.l lVar) {
        if (!b(uri)) {
            return null;
        }
        if (q.d(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            return new File(path);
        }
        return new File(uri.toString());
    }
}
