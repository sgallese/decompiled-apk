package z4;

import android.content.res.Resources;
import android.net.Uri;
import b5.l;
import java.util.List;
import qc.q;
import yc.v;

/* compiled from: ResourceUriMapper.kt */
/* loaded from: classes.dex */
public final class f implements d<Uri, Uri> {
    private final boolean b(Uri uri) {
        boolean z10;
        boolean u10;
        if (!q.d(uri.getScheme(), "android.resource")) {
            return false;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            u10 = v.u(authority);
            if (!u10) {
                z10 = false;
                if (z10 && uri.getPathSegments().size() == 2) {
                    return true;
                }
            }
        }
        z10 = true;
        return z10 ? false : false;
    }

    @Override // z4.d
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Uri a(Uri uri, l lVar) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = lVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        boolean z10 = false;
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            z10 = true;
        }
        if (z10) {
            Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
            q.h(parse, "parse(this)");
            return parse;
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
