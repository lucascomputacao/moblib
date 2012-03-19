package matchs.moblib;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

/**
 * Activity principal
 * @author matchs
 */
public class moblibActivity extends Activity implements OnTouchListener{
	
	/**
	 * Flipper, objeto responsável pela paginação
	 */
	protected ViewFlipper flipper;
	
	/**
	 * Animação de entrada
	 */
	protected Animation slide_in;
	
	/**
	 * Animação de saída
	 */
	protected Animation slide_out;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flipper);
        
        /**
         * Carregando as animações
         */
        this.slide_in = AnimationUtils.loadAnimation(this, R.layout.slide_in);
        this.slide_in = AnimationUtils.loadAnimation(this, R.layout.slide_out);
        
        /**
         * Adicionando as animações no viewFlipper
         */
        this.flipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        this.flipper.setOnTouchListener(this);
        this.flipper.setInAnimation(this.slide_in);
        this.flipper.setOutAnimation(this.slide_out);
    }
    
    /**
     * @todo: Aqui deve-se subistituir por um evento de slide na tela, evento de clique adicionado apenas para teste
     */
    @Override
	public boolean onTouch(View v, MotionEvent event) {
    	
    	this.flipper.showNext();
    	
		return false;
	}
    
}