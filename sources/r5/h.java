package r5;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import qc.q;

/* compiled from: EventPipeline.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final i f22179a;

    /* renamed from: b  reason: collision with root package name */
    private final q5.a f22180b;

    public h(i iVar, q5.a aVar) {
        q.i(iVar, TaskFormActivity.TASK_TYPE_KEY);
        this.f22179a = iVar;
        this.f22180b = aVar;
    }

    public final q5.a a() {
        return this.f22180b;
    }

    public final i b() {
        return this.f22179a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f22179a == hVar.f22179a && q.d(this.f22180b, hVar.f22180b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f22179a.hashCode() * 31;
        q5.a aVar = this.f22180b;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "WriteQueueMessage(type=" + this.f22179a + ", event=" + this.f22180b + ')';
    }
}
