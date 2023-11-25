package cb;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: Markwon.java */
/* loaded from: classes4.dex */
public abstract class e {

    /* compiled from: Markwon.java */
    /* loaded from: classes4.dex */
    public interface a {
        a a(i iVar);

        e build();
    }

    /* compiled from: Markwon.java */
    /* loaded from: classes4.dex */
    public interface b {
    }

    public static a a(Context context) {
        return new f(context).a(db.a.h());
    }

    public abstract void b(TextView textView, Spanned spanned);

    public abstract Spanned c(String str);
}
