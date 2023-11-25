package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbih implements zzbir {
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcfiVar.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                edit.remove(jSONArray.getString(i10));
            }
            edit.apply();
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "GMSG clear local storage keys handler");
        }
    }
}
