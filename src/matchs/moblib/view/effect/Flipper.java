package matchs.moblib.view.effect;

import matchs.moblib.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;

/**
 * @author matchs
 */
public class Flipper extends Activity implements OnClickListener{

	
	protected ViewFlipper flipper;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flipper);
        
        this.flipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        this.flipper.setOnClickListener(this);
    }
	
	@Override
	public void onClick(View v) {
		flipper.showNext();
	}
}
