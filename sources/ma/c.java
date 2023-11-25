package ma;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;

/* compiled from: ParticleField.java */
/* loaded from: classes4.dex */
class c extends View {

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<b> f19832f;

    public c(Context context) {
        super(context);
    }

    public void a(ArrayList<b> arrayList) {
        this.f19832f = arrayList;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.f19832f) {
            for (int i10 = 0; i10 < this.f19832f.size(); i10++) {
                this.f19832f.get(i10).c(canvas);
            }
        }
    }
}
