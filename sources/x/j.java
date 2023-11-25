package x;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import y.l;

/* compiled from: LazyListIntervalContent.kt */
/* loaded from: classes.dex */
public final class j implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<Integer, Object> f25562a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<Integer, Object> f25563b;

    /* renamed from: c  reason: collision with root package name */
    private final pc.r<d, Integer, j0.l, Integer, dc.w> f25564c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(pc.l<? super Integer, ? extends Object> lVar, pc.l<? super Integer, ? extends Object> lVar2, pc.r<? super d, ? super Integer, ? super j0.l, ? super Integer, dc.w> rVar) {
        qc.q.i(lVar2, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(rVar, "item");
        this.f25562a = lVar;
        this.f25563b = lVar2;
        this.f25564c = rVar;
    }

    public final pc.r<d, Integer, j0.l, Integer, dc.w> a() {
        return this.f25564c;
    }

    @Override // y.l.a
    public pc.l<Integer, Object> getKey() {
        return this.f25562a;
    }

    @Override // y.l.a
    public pc.l<Integer, Object> getType() {
        return this.f25563b;
    }
}
