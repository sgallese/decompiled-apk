package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class b {
    public static b c(Bundle bundle, g1 g1Var, o2 o2Var) {
        return d(bundle, g1Var, o2Var, new ArrayList(), new a0() { // from class: com.google.android.play.core.assetpacks.b0
            @Override // com.google.android.play.core.assetpacks.a0
            public final int zza(int i10, String str) {
                return i10;
            }
        });
    }

    private static b d(Bundle bundle, g1 g1Var, o2 o2Var, List list, a0 a0Var) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            hashMap.put(str, AssetPackState.i(bundle, str, g1Var, o2Var, a0Var));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            hashMap.put(str2, AssetPackState.h(str2, 4, 0, 0L, 0L, 0.0d, 1, "", ""));
        }
        return new j0(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, AssetPackState> a();

    public abstract long b();
}
