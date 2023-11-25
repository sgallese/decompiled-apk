package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3747a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3748b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(m.a aVar) {
        int i10;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d10 = aVar.d();
        if (d10 != null) {
            i10 = d10.k();
        } else {
            i10 = 0;
        }
        bundle2.putInt("icon", i10);
        bundle2.putCharSequence("title", aVar.h());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle2.putBoolean("showsUserInterface", aVar.g());
        bundle2.putInt("semanticAction", aVar.f());
        return bundle2;
    }

    private static Bundle b(w wVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", wVar.i());
        bundle.putCharSequence("label", wVar.h());
        bundle.putCharSequenceArray("choices", wVar.e());
        bundle.putBoolean("allowFreeFormInput", wVar.c());
        bundle.putBundle("extras", wVar.g());
        Set<String> d10 = wVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d10.size());
            Iterator<String> it = d10.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            bundleArr[i10] = b(wVarArr[i10]);
        }
        return bundleArr;
    }
}
