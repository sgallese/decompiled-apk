package ob;

import android.text.Spanned;
import android.text.method.MovementMethod;
import android.widget.TextView;
import cb.i;

/* compiled from: MovementMethodPlugin.java */
/* loaded from: classes4.dex */
public class a extends cb.a {

    /* renamed from: a  reason: collision with root package name */
    private final MovementMethod f20596a;

    a(MovementMethod movementMethod) {
        this.f20596a = movementMethod;
    }

    public static a a(MovementMethod movementMethod) {
        return new a(movementMethod);
    }

    @Override // cb.a, cb.i
    public void beforeSetText(TextView textView, Spanned spanned) {
        MovementMethod movementMethod = textView.getMovementMethod();
        MovementMethod movementMethod2 = this.f20596a;
        if (movementMethod != movementMethod2) {
            textView.setMovementMethod(movementMethod2);
        }
    }

    @Override // cb.a, cb.i
    public void configure(i.b bVar) {
        ((db.a) bVar.b(db.a.class)).l(true);
    }
}
