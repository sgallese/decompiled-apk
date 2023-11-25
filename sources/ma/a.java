package ma;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: AnimatedParticle.java */
/* loaded from: classes4.dex */
public class a extends b {

    /* renamed from: v  reason: collision with root package name */
    private AnimationDrawable f19809v;

    /* renamed from: w  reason: collision with root package name */
    private int f19810w;

    public a(AnimationDrawable animationDrawable) {
        this.f19809v = animationDrawable;
        this.f19811a = ((BitmapDrawable) animationDrawable.getFrame(0)).getBitmap();
        this.f19810w = 0;
        for (int i10 = 0; i10 < this.f19809v.getNumberOfFrames(); i10++) {
            this.f19810w += this.f19809v.getDuration(i10);
        }
    }

    @Override // ma.b
    public boolean e(long j10) {
        boolean e10 = super.e(j10);
        if (e10) {
            long j11 = j10 - this.f19828r;
            int i10 = 0;
            if (j11 > this.f19810w) {
                if (this.f19809v.isOneShot()) {
                    return false;
                }
                j11 %= this.f19810w;
            }
            long j12 = 0;
            while (true) {
                if (i10 >= this.f19809v.getNumberOfFrames()) {
                    break;
                }
                j12 += this.f19809v.getDuration(i10);
                if (j12 > j11) {
                    this.f19811a = ((BitmapDrawable) this.f19809v.getFrame(i10)).getBitmap();
                    break;
                }
                i10++;
            }
        }
        return e10;
    }
}
