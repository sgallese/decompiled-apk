package f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import qc.h;
import qc.q;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class d extends f.a<Intent, ActivityResult> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14303a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @Override // f.a
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        q.i(context, "context");
        q.i(intent, "input");
        return intent;
    }

    @Override // f.a
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public ActivityResult c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
