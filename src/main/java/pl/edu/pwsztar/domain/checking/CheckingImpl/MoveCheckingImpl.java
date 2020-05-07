package pl.edu.pwsztar.domain.checking.CheckingImpl;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.checking.MoveChecking;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;

@Component
public class MoveCheckingImpl implements MoveChecking {

    @Override
    public boolean checkBishop(FigureMoveDto figureMoveDto) {
        String start = figureMoveDto.getStart();
        String destination = figureMoveDto.getDestination();

        int startX = start.charAt(0);
        int startY = Integer.parseInt(start.charAt(2)+"");

        int destX = destination.charAt(0);
        int destY = Integer.parseInt(destination.charAt(2)+"");

        return Math.abs(startX - destX) == Math.abs(startY - destY);
    }
}



