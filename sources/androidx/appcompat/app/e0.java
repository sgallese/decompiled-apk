package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: LocaleOverlayHelper.java */
/* loaded from: classes.dex */
final class e0 {
    private static androidx.core.os.j a(androidx.core.os.j jVar, androidx.core.os.j jVar2) {
        Locale d10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < jVar.g() + jVar2.g(); i10++) {
            if (i10 < jVar.g()) {
                d10 = jVar.d(i10);
            } else {
                d10 = jVar2.d(i10 - jVar.g());
            }
            if (d10 != null) {
                linkedHashSet.add(d10);
            }
        }
        return androidx.core.os.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.os.j b(androidx.core.os.j jVar, androidx.core.os.j jVar2) {
        if (jVar != null && !jVar.f()) {
            return a(jVar, jVar2);
        }
        return androidx.core.os.j.e();
    }
}
