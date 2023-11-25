package hb;

import android.text.TextUtils;
import android.util.Base64;

/* compiled from: DataUriDecoder.java */
/* loaded from: classes4.dex */
public abstract class b {

    /* compiled from: DataUriDecoder.java */
    /* loaded from: classes4.dex */
    static class a extends b {
        a() {
        }

        @Override // hb.b
        public byte[] b(hb.a aVar) throws Throwable {
            String c10 = aVar.c();
            if (!TextUtils.isEmpty(c10)) {
                if (aVar.a()) {
                    return Base64.decode(c10.getBytes("UTF-8"), 0);
                }
                return c10.getBytes("UTF-8");
            }
            return null;
        }
    }

    public static b a() {
        return new a();
    }

    public abstract byte[] b(hb.a aVar) throws Throwable;
}
