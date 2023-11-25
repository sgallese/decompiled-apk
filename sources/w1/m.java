package w1;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;

/* compiled from: LayoutIntrinsics.kt */
/* loaded from: classes.dex */
public final class m {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new g(charSequence, 0, charSequence.length()));
        PriorityQueue<dc.l> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: w1.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d10;
                d10 = m.d((dc.l) obj, (dc.l) obj2);
                return d10;
            }
        });
        int next = lineInstance.next();
        int i10 = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new dc.l(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                dc.l lVar = (dc.l) priorityQueue.peek();
                if (lVar != null && ((Number) lVar.d()).intValue() - ((Number) lVar.c()).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new dc.l(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            int i11 = next;
            next = lineInstance.next();
            i10 = i11;
        }
        float f10 = 0.0f;
        for (dc.l lVar2 : priorityQueue) {
            f10 = Math.max(f10, Layout.getDesiredWidth(charSequence, ((Number) lVar2.a()).intValue(), ((Number) lVar2.b()).intValue(), textPaint));
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(dc.l lVar, dc.l lVar2) {
        return (((Number) lVar.d()).intValue() - ((Number) lVar.c()).intValue()) - (((Number) lVar2.d()).intValue() - ((Number) lVar2.c()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        boolean z10;
        boolean z11;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (q.a(spanned, y1.f.class) || q.a(spanned, y1.e.class)) {
                    return true;
                }
            }
            if (textPaint.getLetterSpacing() == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }
}
