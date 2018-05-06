package fanpeihua.customview.boheruler;

import android.content.Context;
import android.support.annotation.IntDef;
import android.view.ViewGroup;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 用于包着尺子的外壳，用于画选取光标、外壳
 */
public class BoheRuler extends ViewGroup {
    private final String TAG = "ruler";
    private Context mContext;

    //尺子Style定义
    public static final int TOP_HEAD = 1, BOTTOM_HEAD = 2, LEFT_HEAD = 3, RIGHT_HEAD = 4;

    @IntDef({TOP_HEAD, BOTTOM_HEAD, LEFT_HEAD, RIGHT_HEAD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RulerStyle {
    }

    private @BoheRuler.RulerStyle int mStyle = TOP_HEAD;

    //内部的尺子
    private InnerRuler mInnerRuler;

}
