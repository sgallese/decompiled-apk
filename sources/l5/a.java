package l5;

import android.content.SharedPreferences;
import qc.q;

/* compiled from: AndroidKVS.kt */
/* loaded from: classes.dex */
public final class a implements w5.b {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f19550a;

    public a(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "sharedPreferences");
        this.f19550a = sharedPreferences;
    }

    @Override // w5.b
    public long a(String str, long j10) {
        q.i(str, "key");
        return this.f19550a.getLong(str, j10);
    }

    @Override // w5.b
    public boolean b(String str, long j10) {
        q.i(str, "key");
        return this.f19550a.edit().putLong(str, j10).commit();
    }
}
